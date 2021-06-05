
$(document).ready(function (){
    $.ajax({
        url:'http://localhost:8080/api/despesa/listar',
        type:'get',
        dataType: 'json',
        success: function(result){
            var html = '';
            $.each(result, function (i, data){
                html += '<tr><td>' + data.nome_despesa +'</td>';
                html += '<td>R$ ' + data.valor_despesa +'</td>';
                html += '<td><a href="#" onclick="removerDespesa(' + data.id +')"><img src="../view/img/trash.svg" width="24px" alt=""></a>';
                html += '<a href="../Usuario/editar_despesa.html?id=' + data.id +' "><img src="../view/img/rubber.svg" width="24px" alt=""></a></td></tr>';
                $("#tabela_listar_despesa_tbody_1").html(html);
            });
        }


    })
});