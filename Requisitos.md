<b>Requisitos não funcionais</b>

_Usabilidade:_
- A interface do usuário deve ser intuitiva e fácil de usar, especialmente na tela de login e na seleção de carros.
- Os elementos da interface do usuário devem ser claramente visíveis e navegáveis, facilitando a interação do usuário.

_Segurança:_
- O sistema de login e autenticação deve ser seguro para proteger as informações confidenciais do usuário, como nome de usuário e senha.
- Deve ser implementado um sistema de gerenciamento de permissões para garantir que apenas usuários autorizados tenham acesso às funcionalidades relevantes do sistema.
- Todas as transações financeiras, como pagamentos e envio de boletos por e-mail, devem ser protegidas por criptografia e medidas de segurança adequadas.

_Desempenho:_
- O sistema deve ser responsivo e rápido, especialmente durante a navegação pelo catálogo de carros disponíveis.
- Deve ser realizada uma otimização adequada do banco de dados para garantir tempos de resposta rápidos, especialmente durante consultas de seleção de carros e cálculos de preços.

_Confiabilidade:_
- O sistema deve ser confiável e estar disponível sempre que os clientes precisarem acessá-lo.
- Deve ser implementado um sistema de backup regular para garantir a recuperação de dados em caso de falha no sistema.

_Escalabilidade:_
- O sistema deve ser capaz de lidar com um aumento no número de usuários e transações, especialmente durante períodos de alta demanda, como feriados ou eventos especiais.
- A arquitetura do sistema deve ser projetada para escalar facilmente, adicionando recursos adicionais conforme necessário.

_Manutenibilidade:_
- O código-fonte deve ser bem estruturado e documentado para facilitar a manutenção e futuras atualizações do sistema.
- Deve ser implementado um processo de monitoramento e registro de erros para identificar e corrigir problemas rapidamente.

_Compatibilidade:_
- O sistema deve ser compatível com uma variedade de dispositivos e navegadores da web para garantir uma experiência consistente para todos os usuários.
- Deve ser realizada uma verificação de compatibilidade para garantir que o sistema funcione corretamente em diferentes plataformas e configurações de navegador.

<b>Requisitos funcionais</b>

_Autenticação de Usuário:_
- Permitir que os usuários façam login utilizando um chatbox para inserir seu nome de usuário e senha.

_Tela de Home:_
- Apresentar uma tela inicial após o login, contendo um menu de navegação.
- Exibir uma foto da frente da locadora como plano de fundo.
- Mostrar um catálogo dos carros disponíveis no momento, com uma foto de cada um deles.

_Visualização de Especificações do Carro:_
- Permitir que os clientes selecionem um carro do catálogo para visualizar suas especificações.
- Exibir informações detalhadas sobre o carro, incluindo a taxa de aluguel por dia, semana ou mês.

_Reserva de Carro:_
- Permitir que os clientes confirmem a seleção do carro desejado.
- Oferecer a opção de direcionar o cliente para a tela de pagamento ou para a locadora mais próxima.

_Menu de Navegação:_
- Incluir opções no menu, como logout, troca de senha e impressão de boleto.
- Permitir que os usuários realizem logout da conta atual.
- Permitir que os usuários alterem suas senhas.
- Oferecer a funcionalidade de impressão de boleto, com o boleto sendo enviado por e-mail.
