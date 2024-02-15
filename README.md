# **# SheetsQuickstart - Google Sheets API Java Quickstart**

## **Documentação**

### **Visão Geral**
Este aplicativo `SheetsQuickstart` utiliza a API do Google Sheets para recuperar dados de uma planilha do Google Sheets e calcular a situação dos alunos com base nas notas e faltas.

### **Funcionalidades**
O aplicativo realiza as seguintes tarefas:
- Recupera os dados de uma planilha do Google Sheets especificada pelo usuário.
- Calcula a situação de cada aluno com base na média das notas (P1, P2 e P3) e no número de faltas.
- Define a situação do aluno de acordo com os critérios seguintes:
    - Se a média for inferior a 5, o aluno é considerado "Reprovado por Nota".
    - Se a média estiver entre 5 (inclusive) e 7 (exclusive), o aluno precisa fazer "Exame Final".
    - Se a média for igual ou superior a 7, o aluno é considerado "Aprovado".
    - Se o número de faltas ultrapassar 25% do número total de aulas, o aluno é considerado "Reprovado por Falta", independentemente da média.
- Calcula a "Nota para Aprovação Final" para os alunos em "Exame Final", se necessário.

### **Pré-requisitos**
- JDK (Kit de Desenvolvimento Java) - Foi utilizado versão 11
- Maven ou Gradle (para gerenciamento de dependências) - Foi utilizado o Gradle
- Projeto na Google Cloud Platform com a API do Sheets habilitada
- Credenciais OAuth 2.0 para acessar a API do Sheets (armazenadas em credentials.json)

### **Instruções de Configuração**
1. Clone este repositório.
2. Configure as credenciais de API do Google Sheets conforme descrito na documentação oficial do Google Sheets API.
3. Abra o arquivo `SheetsQuickstart.java` e atualize o `spreadsheetId` e o `range` de acordo com a sua planilha.
4. Compile e execute o aplicativo.

### **Para mais informações sobre como configurar as credenciais de API do Google Sheets consulte:**
1. (_https://developers.google.com/sheets/api/guides/concepts_) para visão geral da API Google Sheets etc.
2. (_https://developers.google.com/sheets/api/quickstart/java?hl=pt-br_) e como a linguagem escolhida por mim foi Java, essa é o link da documentação para a 1º configuração de ambiente.

### **Link público do repositório**
1. (_https://github.com/Bellacmeireles/Desafio-Tunts.Rocks-2024_)

### **Link público da planilha copiada**
1. (_https://docs.google.com/spreadsheets/d/15hDrYerqMb5g4dQbVrV8nFY11FOdBgr_BRjqBsrhoiQ/edit#gid=0_)