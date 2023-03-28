# eda-questoes-publicas

Para criar questões para o tst-eda, você deve seguir os passos abaixo:

* Criar o conteúdo e testes da questão. Isso é feito através de um arquivo yaml com um formato muito bem definido. Veja [aqui ] um exemplo. Seu arquivo
deve ser nomeado com um bom identificador para a questão. Por exemplo, `fatorial_recursivo.yaml`.

* Criar uma solução para a questão que você criou e que, naturalmente, passe nos testes que você criou. Seu arquivo java não pode ter classe pública e a primeira 
classe que aparece no arquivo deve ter o método main.

* Gere um arquivo json chamado `tst.json` a partir do seu yaml. Procure no google por bibliotecas que fazem isso. É bem padrão. O nome do seu arquivo
json deve ser necessariamente tst.json

* Baixe o arquivo [jtst.py https://drive.google.com/file/d/0B92pxJmC9mzjZnRkSV95akRwNGc/view?usp=sharing&resourcekey=0-lPf-brh6EF5oAxeF9XRTiw]. Esse programa lê o tst.json criado a partir do seu yaml, compila e executa a sua solução passando como entrada os testes que você criou. 
 Basta que o json e a solução esteja no mesmo diretório que o jtst.py.

Para saber se está tudo certo e você pode fazer o PR, execute ```python jtst.py Solution.java```. 

**Importante.** Só funciona para python2.
