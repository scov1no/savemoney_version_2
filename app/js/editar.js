var id_receita = GetURLParameter("id");

$.ajax({
    headers: {
        'Content-Type': 'application/json'
    },
    url: 'http://localhost:8080/api/aluno/get/' + id_receita,
    type: 'GET',
    dataType: 'json',
    success: function (data) {
        $("#input_nome_receita").val(data.nome_receita);
        $("#input_valor_receita").val(data.valor_receita);
        $("#input_descricao_receita").val(data.descricao_receita);
    }
})



$('#form-editar-usuario').submit(function (event) {
    event.preventDefault();



    var formData = {
        'id': id_aluno,
        'matricula': $('#input-matricula').val(),
        'nome': $('#input-nome').val(),
        'nascimento': nascimento.toUTCString(),
        'dataHoraCadastro': dataHoraCadastro.toUTCString()
    };

    $.ajax({
        headers: {
            'Access-Control-Allow-Origin': '*',
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Beaver ' + $.cookie('jwt_token'),
        },
        type: 'PUT',
        url: 'http://localhost:8080/api/aluno/editar',
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