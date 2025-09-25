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

### 🔐 Sistema de Autenticação

**Acesso**

- **Aceso** com validação de usuário, e-mail e senha

- **Validações**  durante o aceso:

- E-mail deve conter "@"

- Senha mínima de 4 caracteres

- Cargo deve ser entre as opções válidas

**Fluxo de Acesso**

- **Autenticação** obrigatória antes de acessar o sistema

- **Validação** em tempo real dos dados inseridos

- **Mensagens** personalizadas de boas-vindas por cargo

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

1. Login no sistema com credenciais válidas
2. Cadastrar turmas
3. Cadastrar alunos vinculados às turmas existentes
4. Cadastrar professores
5. Consultar os dados cadastrados

## 🛠️ Tecnologias Utilizadas

- **Java 21** - Linguagem de programação
- **Padrão MVC** - Arquitetura do projeto
- **Scanner** - Interface de console para entrada de dados
- **Coleção** - ArrayList para armazenar as coleções de classes
- **Validações** - Tratamentos de exceções com try/catch

 - **POO** - Criado seguindo o paradigma de orientação a objetos e utilizando os conceitos de encapsulamento, herança, polimofismo de sobreposição e tratametos de erro com try/catch para dados inválidos

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

Ao executar o sistema, você irá inserir seus dados:
```
=== SISTEMA DE GESTÃO ESCOLAR ===
=== INSIRA SEUS DADOS ===
Usuário:
Email: 
Senha: 
Cargo (administrador/gerente/colaborador):

```
Após isso será liberado o sistema:

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

````

### Exemplo de Uso:

1. **Acesso** com credenciais válidas

2. **Cadastrar** Turma (opção 3)

3. **Cadastrar** Aluno (opção 1) - Vincule à turma criada

4. **Cadastrar** Professor (opção 2)

5. **Listar Dados** (opções 4, 5, 6) para visualizar os cadastros

## ⚠️ Observações Importantes

- O sistema valida os dados de acesso antes de liberar o menu
- Sempre cadastre as turmas antes dos alunos
- O sistema valida a existência de turmas antes de permitir cadastro de alunos
- Use IDs numéricos válidos para vincular alunos às turmas

## 📞 Suporte

Em caso de problemas na execução, verifique:
- Versão do JDK (deve ser 21 ou superior)
- Estrutura de diretórios do projeto
- Permissões de execução no sistema