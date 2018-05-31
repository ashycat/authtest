//$("p").hide();
$(document).ready(function() {
  
  //인증처리 
  $.ajax({
    url : "SampleList.do",
    success : function(result) {
      $("#test").text(result.list[0].NAME);
      console.log('success', result);
    }
  });
});