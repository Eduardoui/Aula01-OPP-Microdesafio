# Projeto FiapRide - Eduardo Bacelar Rudner

## Informações do Aluno

- **Nome:** Eduardo Bacelar Rudner
- **RM:** 564925
- **Turma:** 2CCPF
- **Curso:** Ciências da Computação
- **GitHub:** @Eduardoui

---

## Descrição do Projeto

Este projeto é o resultado do aprendizado nas aulas 1-9 de Programação Orientada a Objetos, onde desenvolvemos o sistema **FiapRide** (aplicativo de mobilidade urbana).

---

## Checklist de Implementação

- [x] Aula 1 - Classes e Objetos
- [x] Aula 2 - Métodos
- [x] Aula 3 - Encapsulamento
- [x] Aula 4 - Construtores
- [x] Aula 5 - Associação
- [x] Aula 6 - Herança
- [x] Aula 7 - Polimorfismo
- [x] Aula 8 - Classes Abstratas
- [x] Aula 9 - Interfaces

---

## Perguntas de Reflexão

### Aula 1 - Classes e Objetos

**Pergunta:** "**Pergunta:** Por que precisamos criar uma classe `Passageiro`? Não seria mais fácil apenas criar variáveis soltas no main, como `String nomeAna = "Ana"` e `double saldoAna = 50.0`?  
**Pense:** E se o FiapRide tiver 1 milhão de usuários? Como a Classe ajuda a resolver isso?"

**Sua Resposta:**
 Uma classe como `Passageiro` organiza os dados e vita variáveis soltas no código, deixando o sistema mais estruturado e mais facil de entender. Em sistemas grandes, ela permite criar vários usuários sem duplicação de código.

---

### Aula 2 - Métodos

**Pergunta:** "Se nós podemos simplesmente fazer `passageiro.saldo = passageiro.saldo + 100` diretamente no código principal, por que dá tanto trabalho criar um método específico chamado `adicionarSaldo(valor)` para fazer isso? Quais seriam os riscos para a nossa startup de mobilidade se deixássemos qualquer programador alterar o saldo diretamente?"

**Sua Resposta:**
 Métodos como `adicionarSaldo(valor)` garantem controle sobre alterações de dados e evitam mudanças diretas no atributo, o que ajuda a manter regras de negócio e evitar erros ou fraudes no sistema.

---

### Aula 3 - Encapsulamento

**Pergunta:** "No nosso código, os atributos são `private`, mas os métodos `getSaldo()` e `getNome()` são `public`. Por que é seguro deixar o get público, mas perigoso deixar o atributo original público?  
Pense bem: Qual a diferença entre dar uma CÓPIA de um documento seu, e entregar o documento ORIGINAL para a pessoa rasurar?"

**Sua Resposta:**
 Getters permitem acessar os dados de forma segura sem expor diretamente os atributos da classe, mantendo o controle sobre como os dados são utilizados. Expor os atributos publicamente pode ser perigoso pois qualquer parde do sistema poderia alterá-los sem regras, quebrando a integridade dos dados.

---

### Aula 4 - Construtores

**Pergunta:** "> "Na nossa classe `Veiculo`, nós tomamos duas decisões arquitetônicas muito importantes:
1. Nós **não** criamos o método `setModelo()`.
2. O `setPlaca()` foi criado como **privado**, e criamos um método público chamado `atualizarPlaca()` para acessá-lo.

 Pensando no mundo real e no Clean Code: Por que é um erro gravíssimo clicar em 'Gerar Getters e Setters para tudo' automaticamente na sua IDE? Como as nossas duas decisões acima protegem o sistema de fraudes e falhas de lógica?  
Dica: Pense sobre o que pode ou não mudar fisicamente em um carro, e a diferença entre "alterar um dado no banco" e "executar um processo real no Detran""

**Sua Resposta:**
 No mundo real, existem informações que precisam de refras específicas para alteração, como dados sensíveis ou testruturais, criar métodos controlados garante mais segurança e evita inconsistência no sistema. Gerar getters e setters automaticamente para todos os atributos pode ser um erro de design, pois nem todos os dados devem ser livremente modificados.

---

### Aula 5 - Associação

**Pergunta:** ""No construtor da `Viagem`, nós exigimos o objeto inteiro (`Passageiro solicitante`). Se o nosso resumo só precisa imprimir o nome da pessoa, não seria mais fácil e mais leve pedir apenas a String do nome no construtor da Viagem (`String nomeDoPassageiro`) em vez do objeto todo?  
Pense nas regras de negócio: O que acontece na hora que a Viagem acaba e o sistema precisa descontar o saldo? Se a Viagem tiver apenas a String "Ana Silva", ela consegue mexer no dinheiro dela?"

**Sua Resposta:**
 Usar um objeto `Passageiro`em vez de uma String mantém todas as informações relacionadas agrupadas e consistentes dentro do sistema, se usassemos apenas o nome, perderíaos acesso a dados importantes como saldo e comportamento do usuário, dificultando regras de negócio como cobrança e validação, ou seja, "Ana Silva" não conseguiria mexer no dinheiro dela.

---

### Aula 6 - Herança

**Pergunta:** ""No nosso código, a mãe `Veiculo` possui os atributos `placa` e `modelo` como `private`. Quando o `Carro` herda de `Veiculo`, ele recebe esses atributos, mas o código dentro de `Carro` NÃO consegue fazer `this.placa = "ABC"`. Ele é obrigado a usar o `super()` ou o `setPlaca()`.

Por que o Java não deixa a filha alterar as variáveis privadas da mãe diretamente? Qual o princípio das aulas passadas que isso está protegendo?""

**Sua Resposta:**
 Atributos do `private` não podem ser acessados diretamente pelas classes filhas para garantir o encapsulamento e protejer os dados da classe mãe, forçando o uso de métodos controlados como getters, setters ou contrutores, assim, qualquer alteração segue as regras definidas pelo sistema.

---

### Aula 7 - Polimorfismo

**Pergunta:** "No nosso loop `for (Veiculo veiculo : frota)`, a variável `veiculo` é do tipo genérico `Veiculo`. Se esquecêssemos de criar o método `calcularAutonomia()` lá na classe mãe `Veiculo`, nós conseguiríamos chamá-lo dentro do loop, mesmo sabendo que ele existe dentro do `Carro` e da `Moto`? Por que o contrato precisa existir na base da hierarquia?"

**Sua Resposta:**
 Não conseguimos chamar o método no loop se ele não existir na classe mãe `Veiculo`, pois precisa estar dentro da classe pela a referência usada ser do tipo genérico e garantir que todas as subclasses tenham um comportamento comum.

---

### Aula 8 - Classes Abstratas

**Pergunta:** "Pense no mundo real: Faz sentido existir um objeto que é APENAS 'Veículo' sem ser um tipo específico? Você já entrou em uma concessionária e comprou "um veículo" genérico, sem ser carro, moto, caminhão ou nada disso?  
Por que, então, no código, precisamos EXPLICITAMENTE dizer ao Java que `Veiculo` é `abstract`? Por que ele não deduz isso sozinho?  
Pense: Se esquecermos de colocar `abstract`, qual o risco que corremos? Alguém pode criar `new Veiculo()` e quebrar a lógica do nosso sistema?"

**Sua Resposta:**
  Não tem sentido criar um objeto genérico como `Veiculo`, pois ele não representa algo físico no mundo real.
  A classe abstrata serve como base para outras classes mais específicas, garantindo estrutura e obrigando a implementação de comportamentos nas classes filhas.

---

### Aula 9 - Interfaces

**Pergunta:** "Por que Java permite herança simples (apenas uma mãe), mas múltipla implementação de interfaces (vários contratos)?  
Pense: Se `CarroEletrico` pudesse herdar de `Veiculo` E de `Bateria` ao mesmo tempo (herança múltipla), o que aconteceria se AMBAS as mães tivessem um método chamado `ligar()`?  
Como as interfaces resolvem esse problema?"

**Sua Resposta:**
 Java não permite herança múltipla para evitar conflitos entre métodos.
 Interfaces resolvem isso porque definem apenas contratos, permitindo que uma classe implemente vários comportamentos sem conflitos de implementação.

---

## Desafios Técnicos Implementados

### Desafio Pessoal (Seu Projeto)

**Qual foi o domínio que você escolheu para seu projeto pessoal?**
 Escolhi um sistema baseado em canecas inteligentes, onde cada caneca possui características próprias (cor, tamanho e material) e também um saldo para simular recargas e pagamentos. O sistema repreta um ambiente de uso diário com controle de valores e tipos diferentes de canecas.

**Quais classes você criou?**
 Foram criadas as classes `Caneca`, `CanecaPlastica`, `CanecaTermica`, `Dono` e a interface `Lavavel`

**Qual foi o maior desafio técnico que você enfrentou?**
 O maior desafil foi entender como usar, classes abstratas e interfaces ao mesmo tempo no projeto. No comelo, eu mistutrava responsabilidades e não sabia muito bem quando criar uma classe abstrata ou uma interface, o que deixava o código (e eu) muito confuso.
 Outra dificultade que tive foi com o polimorfismo, principalmente ao trabalhar com referências do tipo `Caneca` apontando para objetos `CanecaPlastica` e `CanecaTermica`.
 Outra complicação foi o uso da interface `Lavavel`, apesar de não ter sido necessário escrerver tantas linhas de código nessa parte do projeto, no começo eu não entendia bem por que não podia simplesmente colocar o método dentro da classe mãe.
 Com a prática, ententi que a classe abstrata serve para estruturar o que todas as canecas têm em comum, enquanto a interface define um comportamento específico que algumas classes podem ter.

---

## Conclusão

**O que você aprendeu nestas 9 aulas?**
 Ao longo dessas 9 aulas, aprendi os principais conceitos de Programação Orientada a Objetos, começando pela criação de classes e objetos e evoluindo até conceitos mais avançados como herança, polimorfismo, classes abstratas e interfaces.

 Entendi como dividir um sistema em partes menores e mais organizadas, onde cada classe tem uma responsabilidade específica, o que deixa o código mais limpo e fácil de manter.

 Além disso, aprendi a importância do encapsulamento para proteger os dados e evitar alterações indevidas, e como os métodos ajudam a controlar melhor as regras de negócio.

 Também consegui compreender a importância da POO como um todo, entendendo como transformar o pensamento lógico em código mais próximo do mundo real.

**Qual conceito foi mais difícil de entender?**
 O conceito mais difícil foi o poliformismo, principalmente quando comecei a usar referências do tipo classe mãe (`Caneca`) apontando para objetos das classes filhas (`CanecaPlastica` e `CanecaTermica`). No início, não ficava claro como o Java decidia qual método executar em tempo de execução.

**O que você melhoraria no seu projeto se pudesse refazer?**
Melhoraria a organização e separação de responsabilidades entre as classes, deixando o código mais limpo e coeso.
 Também adicionaria mais testes no main para simular cenários diferentes e garantir que todas as regras de negócio estão funcionando corretamente em conjunto.
