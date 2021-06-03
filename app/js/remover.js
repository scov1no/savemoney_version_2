function removerReceita(id_receita) {
    var r = confirm("Confirma a exclusão?");
    if (r == true) {

        var formData = {
            'id': id_receita,
        };

        $.ajax({
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            type: 'POST',
            url: 'http://localhost:8080/api/aluno/remover',
            data: JSON.stringify(formData),
            dataType: 'json',
            encode: true,
            success: function (result) {
                location.reload();
            },
            error: function (result) {
                console.log(result);
            }
        })

    }

}