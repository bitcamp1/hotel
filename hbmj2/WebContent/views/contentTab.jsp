
<script src="js/SpryTabbedPanels.js" type="text/javascript"></script>
<link href="css/SpryTabbedPanels.css" rel="stylesheet" type="text/css" />

<div id="TabbedPanels1" class="TabbedPanels">
  <ul class="TabbedPanelsTabGroup">
    <li class="TabbedPanelsTab" tabindex="0">Notice</li>
    <li class="TabbedPanelsTab" tabindex="0">Guest</li>
  </ul>
  <div class="TabbedPanelsContentGroup">
    <div class="TabbedPanelsContent">
    	<jsp:include page="tabNotice.jsp" flush="false" />
    </div>
    <div class="TabbedPanelsContent">
   		<jsp:include page="tabRoom.jsp" flush="false" />
    </div>
  </div>
</div>
<script type="text/javascript">
var TabbedPanels1 = new Spry.Widget.TabbedPanels("TabbedPanels1", {defaultTab:0});
</script>

