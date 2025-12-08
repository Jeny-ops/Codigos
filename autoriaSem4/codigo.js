// ===== CONFIGURAÇÕES =====
const diasDoMes = 30;
const metaDiaria = 1000.0;
const metaMensal = 25000.0;

// ===== VARIÁVEIS DE CONTROLE =====
let totalVendas = 0;
let melhorDia = 0;
let piorDia = 0;
let maiorVenda = 0;
let menorVenda = Infinity;
let diasAcimaDaMeta = 0;
let diasAbaixoDaMeta = 0;

// Array para armazenar vendas diárias
let vendasDiarias = [];

console.log("========================================");
console.log("   RELATÓRIO DE VENDAS DO MÊS   ");
console.log("========================================\n");

// ===== PARTE 1: SIMULAÇÃO DAS VENDAS DIÁRIAS =====
console.log("--- VENDAS DIÁRIAS ---\n");

for (let dia = 1; dia <= diasDoMes; dia++) {
  // Gerar venda aleatória entre R$ 500 e R$ 2000
  const vendaDia = (Math.random() * 1500 + 500).toFixed(2);
  const vendaNum = parseFloat(vendaDia);

  // Guardar a venda no array
  vendasDiarias.push(vendaNum);

  // Acumular total
  totalVendas += vendaNum;

  // Verificar se bateu meta
  const bateuMeta = vendaNum >= metaDiaria;

  if (bateuMeta) {
    diasAcimaDaMeta++;
  } else {
    diasAbaixoDaMeta++;
  }

  // Exibir dia
  console.log(`Dia ${dia}: R$ ${vendaDia} ${bateuMeta ? "✓" : "✗"}`);

  // Identificar melhor e pior dia
  if (vendaNum > maiorVenda) {
    maiorVenda = vendaNum;
    melhorDia = dia;
  }

  if (vendaNum < menorVenda) {
    menorVenda = vendaNum;
    piorDia = dia;
  }
}

// ===== PARTE 2: ANÁLISE DE DESEMPENHO POR SEMANA =====
console.log("\n--- ANÁLISE POR SEMANA ---\n");

let vendasSemanais = [];
let somaSemana = 0;
let contador = 0;
let numeroSemana = 1;

for (let i = 0; i < vendasDiarias.length; i++) {
  somaSemana += vendasDiarias[i];
  contador++;

  if (contador === 7 || i === vendasDiarias.length - 1) {
    vendasSemanais.push(somaSemana);
    console.log(`Semana ${numeroSemana}: R$ ${somaSemana.toFixed(2)}`);

    somaSemana = 0;
    contador = 0;
    numeroSemana++;
  }
}

// ===== PARTE 3: ESTATÍSTICAS FINAIS =====
console.log("\n========================================");
console.log("          ESTATÍSTICAS FINAIS           ");
console.log("========================================\n");

const mediaDiaria = totalVendas / diasDoMes;
const porcentagemMeta = (totalVendas / metaMensal) * 100;
const bateuMetaMensal = totalVendas >= metaMensal;

console.log(`Total de vendas: R$ ${totalVendas.toFixed(2)}`);
console.log(`Média diária: R$ ${mediaDiaria.toFixed(2)}`);
console.log(`Meta mensal: R$ ${metaMensal.toFixed(2)}`);
console.log(`Atingido: ${porcentagemMeta.toFixed(1)}%`);
console.log(
  `Status: ${bateuMetaMensal ? "✓ META BATIDA!" : "✗ Meta não atingida"}\n`
);

console.log(`Melhor dia: Dia ${melhorDia} (R$ ${maiorVenda.toFixed(2)})`);
console.log(`Pior dia: Dia ${piorDia} (R$ ${menorVenda.toFixed(2)})`);
console.log(`Dias acima da meta: ${diasAcimaDaMeta}`);
console.log(`Dias abaixo da meta: ${diasAbaixoDaMeta}\n`);

// ===== PARTE 4: PROJEÇÃO =====
console.log("--- PROJEÇÃO ---\n");

// Se mantiver a média atual, quanto vai vender no próximo mês?
const projecaoProximoMes = mediaDiaria * 30;
console.log(`Projeção próximo mês: R$ ${projecaoProximoMes.toFixed(2)}`);

// Quantos dias precisaria vender na meta para atingir objetivo mensal?
const diasNecessarios = Math.ceil(metaMensal / metaDiaria);
console.log(`Dias na meta necessários: ${diasNecessarios} dias`);

// ===== PARTE 5: BÔNUS - SIMULAÇÃO DE CRESCIMENTO =====
console.log("\n--- SIMULAÇÃO DE CRESCIMENTO ---\n");

// Se crescer 5% ao mês, qual será a venda em 12 meses?
let vendaAtual = totalVendas;
const taxaCrescimento = 1.05; // 5%

console.log("Projeção de crescimento (5% ao mês):");
for (let mes = 1; mes <= 12; mes++) {
  vendaAtual *= taxaCrescimento;
  console.log(`Mês ${mes}: R$ ${vendaAtual.toFixed(2)}`);
}

console.log("\n========================================");
