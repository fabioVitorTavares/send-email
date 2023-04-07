# send-email

Aplicação desenvolvida com springboot para o envio de email, a aplicação recebe 
um post com o email remetente, email destinatário, assunto de email e o conteúdo
do email. A aplicação válida se os email remetente e destinatário são emails
válidos, faz a montagem e envio do email e verifica a situação do envio, caso
seja enviada com sucesso e salvo no banco de dados um registro do envio com todas
informações e com status SENT, caso haja algum erro no envio do email, o registro 
é salvo com status ERROR. 