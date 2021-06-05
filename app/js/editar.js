var id_receita = GetURLParameter("id");

$.ajax({
    headers: {
        'Content-Type': 'application/json'
    },
    url: 'http://localhost:8080/api/receita/get/' + id_receita,
    type: 'GET',
    dataType: 'json',
    success: function (data) {
        $("#input_nome_receita").val(data.nome_receita);
        $("#input_valor_receita").val(data.valor_receita);
        $("#input_descricao_receita").val(data.descricao_receita);
    }
})



$('#form-editar').submit(function (event) {
    event.preventDefault();


    //Editar receita
    var formData = {
        'id': id_receita,
        'nome_receita': $('#input_none_receita').val(),
        'valor_receita': $('#input_valor_receia').val(),
        'descricao_receita': $('#input_descricao_receita').val()

    };

    $.ajax({
        headers: {

            'Accept': 'application/json',
            'Content-Type': 'application/json',
            },
        type: 'PUT',
        url: 'http://localhost:8080/api/receita/editar',
        data: JSON.stringify(formData),
        dataType: 'json',
        encode: true,
        success: function (data) {
            location.href = 'receita.html';
        },
        error: function (data) {
            $('#div-alert-message').prepend(data.responseText);
            $('#div-alert-message').fadeIn();
        }
    });

});