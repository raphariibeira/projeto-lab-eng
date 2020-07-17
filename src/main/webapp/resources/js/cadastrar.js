function cadastrar(nome, senha){
    $.ajax({
        url: '/calculadora/cadastrar',
        method: 'POST',
        data:{nome:nome, senha:senha},
        success: function(response) {
            console.log("sucess");
            window.location.href = "http://localhost:8080/calculadora/login"
          },
          error: function (response) {
            alert('(Erro)Favor verifique seus dados');
          }
    });
}