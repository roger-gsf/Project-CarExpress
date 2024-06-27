# Locadora De Carros

_<b>Problema:</b>_
É preciso que haja um sistema para administrar de melhor forma uma locadora de carros, pois uma concessionária contém varios carros e é necessário manter o registro de todos eles: marcas, modelos, ano, potência do motores, cores, placas e disponibilidade. Além disso, os usuários da locadora poderão consultar o catálogo, locar e devolver carros.

_<b>Resolução:</b>_ Criaremos um sistema de locadora de carros usando Java e MySQL com as seguintes etapas:

_Modelagem do Banco de Dados:_
- Criaremos uma estrutura de tabelas no banco de dados para armazenar informações sobre clientes e dados sobre o carro como marcas, modelos, ano, potência do motores, cores, placas e disponibilidade.
- Definiremos relacionamentos entre as tabelas (por exemplo, um carro pertence a uma marca).

_Implementação do CRUD:_
- Criaremos classes Java para representar entidades como Carros e Clietes/Usuários. Implementaremos as operações CRUD (Create, Read, Update, Delete) somente para a entidade Locadora:<br>
CREATE: Adicionar novos carros, marcas, modelos, ano, potência do motores, cores, placas e disponibilidade e usuários ao sistema;<br>
READ: Consultar informações sobre os carros, e usuários;<br>
UPDATE: Modificar detalhes do carro ou usuários;<br>
DELETE: Remover registros quando um carro é devolvido ou um usuário/carro é excluído.

_Interface do Usuário:_
- Criaremos uma interface gráfica utilizando Java SWING para interagir com o sistema.
- Os usuários devem ter a possibilidade de:<br>
Pesquisar carros por marca, modelos, ano, potência do motores, cores, placas e disponibilidade;<br>
Registrar locações e devoluções;<br>
Visualizar informações detalhadas sobre um carro específico.<br><br>

_<b>Importância do Projeto:</b>_
- Organização: Uma locadora bem gerenciada é essencial para manter pessoas que gostam de locar carros ou de viajar para outros estados.

_<b>Figma:</b>_ <br>
https://www.figma.com/file/9eD5I31gfHP2Yje25ueB4L/CAR-DEALERSHIP?type=design&node-id=0-1&mode=design&t=AOGcebztLbeIOzFj-0
<br>
<br>
_<b>Requisitos:</b>_
[Requisitos.txt.](https://github.com/rogergsf/Car_Dealership/files/14964489/Requisitos.txt.txt)
