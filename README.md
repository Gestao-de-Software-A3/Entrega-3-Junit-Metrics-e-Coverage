# Relatório de testes em JUnit com Coverage e Metrics

## Testes unitários com o JUnit

Na terceira etapa do projeto, o objetivo era se valer do JUnit para realizar testes unitários em algumas das funcionalidades chave do aplicativo Basket. Para tanto, foram realizados 21 testes unitários nas classes do Repositório de usuário e dos podutos na camada de dados do aplicativo, além dos UseCases de usuário e produtos, cobrindo, assim, os principais métodos que serão implementados na versão final do Basket. Além disso foram realizados testes na classe dos conversores para garantir a eficácia do código.

Os testes se encontram na pasta **JunitTests** (anexada em commit dessa entrega no GitHub), como se vê:
* 5 testes unitários na classe ProductRepositoryImplTests;
* 4 testes unitários na classe UserRepositoryImplTests;
* 5 testes unitários na classe ProductUseCasesTests;
* 4 testes unitários na classe UserUseCasesTests;
* 3 testes unitários na classe 3 ConverterTests;

## Coverage

Utilizando o Coverage nativo do Android Studio (IDE para a qual o projeto foi idealizado e está sendo executado), foi averiguado que 34,3% das classes foram testadas com sucesso.

![Tests Coverage](https://github.com/eduardobelico/Entrega-3-Junit-Metrics-e-Coverage/assets/116230274/c066c218-5557-4d84-9766-78f55a7c93be)
![Tests Coverage print](https://github.com/eduardobelico/Entrega-3-Junit-Metrics-e-Coverage/assets/116230274/a0a732a7-ba45-44c2-a16d-d524ae0eb21b)

** A equipe tentou inicialmente utilizar o Jacoco Code Coverage, conforme indicado na UC. A falta de atualizações e integração com o Kotlin e o Android Studio não permitiram o uso desse plugin sem comprometer a integridade do código, levando ao uso do recurso Coverage integrado do Android Studio, que permite a realização dos testes juntamente ao Coverage, mas rendendo os mesmos resultados que o uso do Jacoco.

## Metrics

Para a realização da inspeção do código, foi utilizada a função integrada do AndroidStudio "Inspect Code". Essa funcionalidade, assim como se propõe o CodeMetrics, fez a análise do código atual, rendendo os seguinte resultados:

![Metrics](https://github.com/eduardobelico/Entrega-3-Junit-Metrics-e-Coverage/assets/116230274/909120f7-4319-407d-b7ac-78cf6a713e7f)

Os erros apresentados se referem a camada de presentation do aplicativo ainda não implementada e não a nenhum dos métodos essenciais do código, que foram testados e aprovados nos testes realizados com o JUnit. Especificamente os erros apontam o não apontamento da Activity "MainActivity" no manifesto do projeto e a falta da classe App que será futuramente integrada na injeção de dependências.
