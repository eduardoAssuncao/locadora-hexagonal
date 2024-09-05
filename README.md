# locadora-hexagonal
Etapa 01:

Atividade 03 da parte 03 que consiste em contruir uma API, utilizando a arquitetura Hexagonal, para locação de jogos digitais.

Etapa 02:

I. Integração online:

 - Para essa funcionalidade, a utilização de uma arquitetura baseada em microserviços seria interessante, já que cada funcionalidade, como locação, consulta de disponibilidade e pagamento, seria dividida em serviços isolados, facilitando a escalabilidade, manutenção e evitar que possíveis erros em funcionalidades específicas venham a derrubar toda a aplicação.
 - Além disso, referente aos princípios SOLID, o princípio de Responsabilidade Única (SRP) é importante para garantir que cada serviço tenha uma única responsabilidadem, como locação e pagamento. E, em conjunto, a utilização do padrão Factory Method poderia garantir o melhore gerenciamento das diferentes forma de locação e pagamento, permitindo a criação flexível de instâncias sem acoplar a aplicação às implementações concretas.
 - Por fim, alguns serviçõs externos que poderiam ser utilizados para os pagamentos seriam gateways como Stripe ou PayPal, usando boas práticas de segurança (como PCI-DSS).

II. Sistema de avaliação e comentários:

- Para essa funcionalidade, a utilizaão do princípio de Inversão de Dependência (DIP) poderia ser utilizada de modo que a interface de persistência para as avaliações e comentãrios possam ser desacopladas da implementação concreta, permitindo mudanças futuras na camada de armazenamento sem afetar o restante do sistema.
- Além disso, o uso do padrão Observer seria interessante para notificar outros usuários sobre novas avaliações, atualizando automaticamento o feed de recomendações.
- Por fim, a utilização de um banco de dados NoSQL (como MongoDB) para armazenar as avaliações e comentários, facilitando a escalabilidade e flexibilidade.

III. Integração com redes sociais:
 
- Para essa integração, o princípio da Substituição de Liskov (LSP) seria importante para garantir que a integração com diferentes APIs de redes sociais siga uma interface comum, permitindo que novas integrações possam ser adicionadas sem modificar o código existente.
- Como padrão, o Adapter seria usado para adaptar as APIs das redes sociais ao formato esperado pela aplicação.
- Como serviços externos, a utilização de bibliotecas como o OAuth para autenticação para a integração com redes sociais e APIs de redes como Facebook e Twitter para compartilhar informações.

IV. Notificações e lembretes:

- O princípio da Segregação de Interface (ISP) seria útil, já que permitirua que o serviço de notificação tenha interfaces separadas para tipos deferentes de notificações (SMS, e-mail e push notification).
- Para o padrão, o Observer também se aplica, já que serviria para acionar lembretes e notificações de forma assíncrona e com baixa acoplagem.
- Como serviços externos, realizaríamos a integração com serviços como Firebase (para push notifications) e Twilio (para SMS).

V. Suporte a diferentes idiomas e moedas:

- O princípio de Aberto/Fechado (OCP) é essencial, uma vez que o sistema seria configurável para novos idiomas e moedas sem necessidade de modificar o código existente.
- Como padrão, o Strategy poderia ser aplicado, permitindo que diferentes estratégias de formatação de moeda e localização sejam trocadas dinamicamente. ALém desse, o padrão AbstractFactory também surge como uma possibilidade.
- Para os serviços externos, poderemos utilizar o Open Exchange Rates para conversão de moedas e a biblioteca i18next para a tradução e localização do sistema.
