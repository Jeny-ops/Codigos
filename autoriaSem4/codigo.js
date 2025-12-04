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

console.log("========================================");
console.log("   RELATÓRIO DE VENDAS DO MÊS   ");
console.log("========================================\n");

// ===== PARTE 1: SIMULAÇÃO DAS VENDAS DIÁRIAS =====
console.log("--- VENDAS DIÁRIAS ---\n");

for (let dia = 1; dia <= diasDoMes; dia++) {
  // Gerar venda aleatória entre R$ 500 e R$ 2000
  const vendaDia = (Math.random() * 1500 + 500).toFixed(2);
  const vendaNum = parseFloat(vendaDia);

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

// Implemente análise semanal aqui
// Divida os 30 dias em semanas e calcule total de cada

let diaSem1;
let diaSem2;
let diaSem3;
let diaSem4;
let totalVendaSem1;




for(let i=1;i<30;i++){
  
  if(i<=7){
    diaSem1=i
    
    for (let totalSem1 = 1; totalSem1 <= 7; totalSem1++) {
        const vendaDia = (Math.random() * 1500 + 500).toFixed(2);
        vendaNum = parseFloat(vendaDia);
        totalVendaSem1= totalSem1 + vendaNum;
    }

    console.log(`Total vendas semana 1: ${totalVendaSem1}`)

}

  else if (i>=8 && i<=14){
    diaSem2=i;
  }

   else if (i>=15 && i<=21){
    diaSem3=i;
  }

   else if (i>=22 && i<=30){
    diaSem4=i;
  }
}

