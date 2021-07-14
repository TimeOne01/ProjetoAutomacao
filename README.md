# ProjetoAutomacao

Esse projeto foi desenvolvido para automatizar o site "https://automacaocombatista.herokuapp.com/", com o intuito de treinamento no programa de estágio 2021 da Yaman.

## Autores

Esse projeto é composto por:

* Alana Mendes (https://github.com/asm-alana)
* Felipe Bento (https://github.com/fehbento)
* Iuri Reducino (https://github.com/iuriraredu)
* Marcus Vinicius (https://github.com/MarcusVini476)

## Breve Descrição do Projeto

Este projeto foi desenvolvido em Maven, com JAVA 8 e auxilio do Selenium para comandar o browser.

Para automatização do site, foram descritos quais casos de teste seriam testados em BDD junto com Gherkin, e o Cucumber auxilia em passar as histórias de usuário para cógido do teste.

Este projeto encapsula o browser e suas configurações, bem como os objetos manipulados durante os testes automatizados no PageObject, enquanto a manipulação dos elementos ficam por conta das classes de Funcionalidades, para que assim, as classes de Steps fique explicita e intuitiva, apresentando apenas os passos que são realizados durante os testes e as validações necessárias para que esse teste passe ou falhe.

