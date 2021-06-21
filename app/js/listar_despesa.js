
$(document).ready(function (){
    if ($.cookie('jwt_token') == null || $.cookie('jwt_token') == undefined) {
        alert("Usuário não autenticado");
        location.href = "login.html";
    }
    $.ajax({
        headers: {
            'Content-Type': 'application/json',
            'Authorization': 'Beaver ' + $.cookie('jwt_token'),
        },
        url:'http://localhost:8080/api/despesa/listar',
        type:'get',
        dataType: 'json',
        success: function(result){
            var html = '';
            $.each(result, function (i, data){
                html += '<tr><td>' + data.nome_despesa +'</td>';
                html += '<td>R$ ' + data.valor_despesa +'</td>';
                html += '<td><a href="#" onclick="removerDespesa(' + data.id +')"><img  src="../view/img/trash.svg"  alt=""></a>';
                html += '<a href="../Usuario/editar_despesa.html?id=' + data.id +' "><img src="../view/img/rubber.svg"  alt=""></a>';
                html += '<a href="../Usuario/view_despesa.html?id=' + data.id +' "><img src="../view/img/eye.svg"  alt=""></a></td></tr>';

                $("#tabela_listar_despesa_tbody_1").html(html);
            });
        }


    })
});