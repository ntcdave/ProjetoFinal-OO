# Documentação do Projeto Mercearia
## Visão Geral

Este projeto é uma aplicação Java com uma interface gráfica desenvolvida utilizando Swing. Ele gerencia informações relacionadas a produtos, funcionários, fornecedores e clientes. O sistema possui funcionalidades para cadastro e geração de relatórios.

## Classes

### Classes de Model

#### `Cliente`

- **Localização:** `model/cliente/Cliente.java`
- **Descrição:** Classe abstrata que representa um cliente com os atributos `nome` e `numero`. Define o método abstrato `getRelatorio()` que deve ser implementado por subclasses.
- **Métodos:**
  - `public Cliente(String nome, String numero)`: Construtor da classe.
  - `public abstract String getRelatorio()`: Método abstrato para obter um relatório do cliente.
  - `public String getNome()`: Retorna o nome do cliente.

#### `PessoaJuridica`

- **Localização:** `model/cliente/PessoaJuridica.java`
- **Descrição:** Extensão da classe `Cliente` que representa uma pessoa jurídica. Adiciona o atributo `cnpj` e implementa o método `getRelatorio()` para gerar um relatório específico para pessoas jurídicas.
- **Métodos:**
  - `public PessoaJuridica(String nome, String cnpj, String numero)`: Construtor da classe.
  - `@Override public String getRelatorio()`: Implementação do método `getRelatorio()`.

### Classes de Controller

#### `ControleCliente`

- **Localização:** `controller/ControleCliente.java`
- **Descrição:** Controlador para gerenciar operações relacionadas a clientes.

#### `ControleFornecedor`

- **Localização:** `controller/ControleFornecedor.java`
- **Descrição:** Controlador para gerenciar operações relacionadas a fornecedores.

#### `ControleProduto`

- **Localização:** `controller/ControleProduto.java`
- **Descrição:** Controlador para gerenciar operações relacionadas a produtos.

#### `ControleFuncionario`

- **Localização:** `controller/ControleFuncionario.java`
- **Descrição:** Controlador para gerenciar operações relacionadas a funcionários.

### Classes de View

#### `TelaPrincipal`

- **Localização:** `view/TelaPrincipal.java`
- **Descrição:** Classe principal que representa a tela principal da aplicação. Contém o menu de navegação para cadastro e relatórios.
- **Métodos:**
  - `public TelaPrincipal()`: Construtor da classe.
  - `private void initComponents()`: Inicializa os componentes da interface gráfica.
  - `private void JMI_relatorioProdutosActionPerformed(java.awt.event.ActionEvent evt)`: Abre o relatório de produtos.
  - `private void JMI_relatorioFuncionariosActionPerformed(java.awt.event.ActionEvent evt)`: Abre o relatório de funcionários.
  - `private void JMI_relatorioFornecedoresActionPerformed(java.awt.event.ActionEvent evt)`: Abre o relatório de fornecedores.
  - `private void JMI_cadastrarProdutoActionPerformed(java.awt.event.ActionEvent evt)`: Abre a tela de cadastro de produto.
  - `private void JMI_cadastrarFuncionarioActionPerformed(java.awt.event.ActionEvent evt)`: Abre a tela de cadastro de funcionário.
  - `private void JMI_cadastradarForncecedorActionPerformed(java.awt.event.ActionEvent evt)`: Abre a tela de cadastro de fornecedor.
  - `private void JMI_cadastrarClienteActionPerformed(java.awt.event.ActionEvent evt)`: Abre a tela de cadastro de cliente.
  - `private void JMI_relatorioClientesActionPerformed(java.awt.event.ActionEvent evt)`: Abre o relatório de clientes.
  - `public static void main(String args[])`: Método principal para inicializar a aplicação.

### Outras Classes de View

#### `CadastroCliente`

- **Localização:** `view/CadastroCliente.java`
- **Descrição:** Tela para o cadastro de clientes.

#### `CadastroFornecedor`

- **Localização:** `view/CadastroFornecedor.java`
- **Descrição:** Tela para o cadastro de fornecedores.

#### `CadastroProduto`

- **Localização:** `view/CadastroProduto.java`
- **Descrição:** Tela para o cadastro de produtos.

#### `CadastroFuncionario`

- **Localização:** `view/CadastroFuncionario.java`
- **Descrição:** Tela para o cadastro de funcionários.

#### `RelatorioClientes`

- **Localização:** `view/RelatorioClientes.java`
- **Descrição:** Tela para exibir relatórios de clientes.

#### `RelatorioFornecedores`

- **Localização:** `view/RelatorioFornecedores.java`
- **Descrição:** Tela para exibir relatórios de fornecedores.

#### `RelatorioProdutos`

- **Localização:** `view/RelatorioProdutos.java`
- **Descrição:** Tela para exibir relatórios de produtos.

#### `RelatorioFuncionarios`

- **Localização:** `view/RelatorioFuncionarios.java`
- **Descrição:** Tela para exibir relatórios de funcionários.

## Instruções de Uso

1. **Compilar e Executar:** Compile e execute o projeto usando uma IDE compatível com Java, como o NetBeans ou o IntelliJ IDEA.
2. **Navegação:** Utilize o menu na tela principal para acessar as telas de cadastro e relatórios.
3. **Cadastro:** Preencha os formulários nas respectivas telas de cadastro e salve as informações.
4. **Relatórios:** Gere relatórios acessando a seção de relatórios no menu e selecione o tipo desejado.

## Requisitos

- Java Development Kit (JDK) 8 ou superior.
- Uma IDE compatível com Java.


