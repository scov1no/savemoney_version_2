$(document).ready(function (){
    $.ajax({
        url:'http://localhost:8080/api/receita/listar',
        type:'get',
        dataType: 'json',
        success: function(result){
            var html = '';
            $.each(result, function (i, data){
                html += '<tr><td>' + data.nome +'</td>';
                $("#tbListarReceitas").html(html);
            });
        }
    })
});
function removerAluno(id_receita){
    var r = confirm("Cofirma a exclusão?");
    if(r == true){
        var formData = {
            "id" : id_receita,

        };
        $.ajax({
            headers:{
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            type:'POST',
            url: 'http://localhost:8080/api/receita/remover',
            data:JSON.stringify(formData),
            dataType: 'json',
            enconde: true,
            success: function(result){
                location.reload();
            },
            erro: function(result){
                console.log(result);
            }
        })
    }
}