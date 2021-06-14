
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
                html += '<td><a href="#" onclick="removerDespesa(' + data.id +')"><img  src="../view/img/trash.svg"  alt=""></a>';
                html += '<a href=' + data.id +'"../Usuario/editar_despesa.html?id= "><img src="../view/img/rubber.svg"  alt=""></a>';
                html += '<a href=' + data.id +'"../Usuario/view_despesa.html?id= "><img src="../view/img/eye.svg"  alt=""></a></td></tr>';

                $("#tabela_listar_despesa_tbody_1").html(html);
            });
        }


    })
});