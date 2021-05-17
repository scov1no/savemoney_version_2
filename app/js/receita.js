//Processar formulário
$('#form-inserir-usuario').submit(function (event) {

    event.preventDefault();

    //Criar formData
    var formData = {'nome': $('#input-nome').val()};

    $.ajax({
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Beaver ' + $.cookie('jwt_token'),
        },
        type: 'POST',
        url: 'http://localhost:8080/api/aluno/incluir',/*<----------Trocar isso daqui*/
        data: JSON.stringify(formData),
        dataType: 'json',
        encode: true,
        success: function (data) {
            location.href = 'listarAlunos.html';
        },
        error: function (data) {
            $('#div-alert-message').prepend(data.responseText);
            $('#div-alert-message').fadeIn();
        }
    });
});