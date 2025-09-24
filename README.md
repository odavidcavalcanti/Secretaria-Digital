# 📚 Secretaria Digital - Sistema de Gestão Escolar

Sistema desenvolvido em Java para gestão de alunos, professores e turmas em instituições de ensino, seguindo o padrão arquitetural MVC.

## 🏗️ Estrutura do Projeto

```
Secretaria-Digital/
├── src/
│   ├── model/          # Entidades do sistema
│   │   ├── Pessoa.java
│   │   ├── Aluno.java
│   │   ├── Professor.java
│   │   └── Turma.java
│   ├── controller/     # Lógica de controle
│   │   ├── AlunoController.java
│   │   ├── ProfessorController.java
│   │   └── TurmaController.java
│   ├── service/        # Regras de negócio
│   │   ├── AlunoService.java
│   │   ├── ProfessorService.java
│   │   └── TurmaService.java
│   ├── view/           # Interface com usuário
│   │   ├── AlunoView.java
│   │   ├── ProfessorView.java
│   │   ├── TurmaView.java
│   │   └── MenuView.java
│   └── SecretariaDigital.java  # Classe principal
└── README.md
```

## ✅ Funcionalidades

### Cadastros
- **Alunos**: Nome, e-mail, CPF, nota, faltas e turma
- **Professores**: Nome, e-mail, CPF e disciplina
- **Turmas**: Ano letivo e subdivisão (A, B, C, etc.)

### 📊 Listagens
- Listar todos os alunos com suas informações completas
- Listar todos os professores cadastrados
- Listar todas as turmas com seus dados

### 🔄 Fluxo de Trabalho
1. Cadastrar turmas
2. Cadastrar alunos vinculados às turmas existentes
3. Cadastrar professores
4. Consultar os dados cadastrados

## 🛠️ Tecnologias Utilizadas

- **Java 21** - Linguagem de programação
- **Padrão MVC** - Arquitetura do projeto
- **Scanner** - Interface de console para entrada de dados
- **Coleção** - ArrayList para armazenar as coleções de classes

 - **POO** - Criado seguindo o paradigma de orientação a objetos e utilizando os conceitos de encapsulamento, herança, polimofismo de sobreposição e tratametos de erro com try/catch

## 📥 Pré-requisitos

- JDK 21 ou superior
- IDE Java (IntelliJ, Eclipse, VS Code) ou terminal
- Git instalado para clonar o repositório

## 🚀 Instalação e Execução

### 1. Clone o repositório:

```bash
git clone https://github.com/odavidcavalcanti/Secretaria-Digital.git
```

### 2. Abra o projeto em uma IDE Java

### 3. Compile e execute a classe `SecretariaDigital.java`

### Execução via Terminal:

```bash
# Navegue até o diretório do projeto
cd Secretaria-Digital

# Compile todos os arquivos Java
javac -d bin src/*.java src/model/*.java src/controller/*.java src/service/*.java src/view/*.java

# Execute a aplicação
java -cp bin SecretariaDigital
```

## 🎯 Como Usar

Ao executar o sistema, você verá o menu principal:

```
=== SISTEMA DE GESTÃO ESCOLAR ===
1. Cadastrar Aluno
2. Cadastrar Professor
3. Cadastrar Turma
4. Listar Alunos
5. Listar Professores
6. Listar Turmas
0. Sair
Escolha uma opção:
```

### Exemplo de Uso:

1. **Cadastrar Turma** (opção 3)
2. **Cadastrar Aluno** (opção 1) - Vincule à turma criada
3. **Listar Dados** (opções 4, 5, 6) para visualizar os cadastros

## ⚠️ Observações Importantes

- Sempre cadastre as turmas antes dos alunos
- O sistema valida a existência de turmas antes de permitir cadastro de alunos
- Use IDs numéricos válidos para vincular alunos às turmas

## 📞 Suporte

Em caso de problemas na execução, verifique:
- Versão do JDK (deve ser 21 ou superior)
- Estrutura de diretórios do projeto
- Permissões de execução no sistema