$(document).ready(function () {
  $(".btn-delete").click(function() {
    let id = $(this).attr("roleid");
    $.ajax({
      method: "GET",
      url: "http://localhost:8080/project_crm/api/role?id=" + id,
    }).done((data) => {
        console.log(data)
        if(data.success){
            $(this).closest("tr").remove();
        }else{
            alert("Xoa that bai");
        }
    });
  });
});
