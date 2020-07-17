function login(email, senha){
    $.ajax({
        url: '/calculadora/login', method: 'POST',data:{email:email, senha:senha},
        success: function(response) {
            window.location.href = "http://localhost:8080/calculadora/calcular"
          },
        error: function (response) {
            alert('(Erro) Verifique  seu email ou senha');
        }
    });
}