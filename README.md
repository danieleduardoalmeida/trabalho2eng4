Trabalho feito para a disciplina Engenharia de Software 4. Alunos: Daniel Eduardo Costa de Almeida Oscar Yasukazu Ota Oshiro

No projeto AcessoSite não há nenhuma restrição de acesso ao objeto Site. Isso pode ser perigoso quando seus objetos são partes cruciais de um sistema e os clientes são várias aplicações iniciadas (incluindo algumas maliciosas).
No projeto AcessoSiteProxy foi implementado o padrão Proxy de proteção. No padrão proxy de proteção é utilizado quando deseja controlar o acesso aos objetos, através de uma verificação por exemplo. O proxy pode passar o pedido para o objeto de serviço somente se as credenciais do cliente coincidem com certos critérios.
No projeto AcessoSiteProxy
  A Interface Site: interface que define o contrato para nossos objetos, com o método conectar.
  Classe RealSite: implementação da interface Site, a implementação do método para conectar a uma determinada URL.
  Classe SiteProxy: este é o objeto que aplica o padrão Proxy. Ele implementa a mesma interface Site e possui uma propriedade/variável sitesProibidos para armazenar os sites que tem acesso proibido. Ao chamar o método conectar, este verificará se a variável sitesProibidos contém a URL informada, se isso acontece uma exceção é lançada dizendo que o acesso ao site é negado. Caso contrário o acesso ao site será liberado e o método conectar será chamado.
