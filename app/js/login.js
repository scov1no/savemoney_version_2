//Processar formulário
$('#form-login').submit(function (event) {
    if ($.cookie('jwt_token') == null || $.cookie('jwt_token') == undefined) {
        alert("Usuário não autenticado");
        location.href = "Usuario/dashboard.html";
    }
    event.preventDefault();

    //Criar formData
    var formData = {
        'username': $('#input-usuario').val(),
        'password':  $('#input-senha').val()
    };

    $.ajax({
        headers: {
            'Content-Type': 'application/json',
            'Authorization': 'Beaver ' + $.cookie('jwt_token'),
        },
        type: 'POST',
        url: 'http://localhost:8080/api/auth/authenticate',
        data: JSON.stringify(formData),
        dataType: 'json',
        encode: true,
        success: function (data) {
            $.cookie('jwt_token', data.jwt);
            location.href = '../Usuario/dashboard.html';
        },
        error: function (data) {
            alert("Usuário ou senha inválidos");
        }
    });
});

function sair() {
    console.log("Apagar token");
    $.removeCookie('jwt_token', {path: '/app'});
    console.log($.cookie('jwt_token'));
    location.href = 'login.html';
}