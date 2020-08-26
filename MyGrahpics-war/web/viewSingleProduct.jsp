<%-- 
    Document   : viewSingleProduct
    Created on : Nov 21, 2015, 10:40:41 AM
    Author     : JPT TERSOO AGBE
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
   <form action="" method="get"><table width="100%" border="0">
  <tr>
    <td width="47%">&nbsp;</td>
    <td width="53%">&nbsp;</td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td><div class="form-group">
        <label class="col-md-3 control-label">Perforation</label>
       <div class="col-md-9">
         <select name="perforation" type="text" class="form-control" id="perforation" >
         </select>
       </div>
    </div></td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td><div class="form-group">
        <label class="col-md-3 control-label">Envelops</label>
        <div class="col-md-9">
          <select name="perforation2" type="text" class="form-control" id="perforation2" >
          </select>
        </div>
    </div></td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td><div class="form-group">
        <label class="col-md-3 control-label">Sequential Numbering</label>
        <div class="col-md-9">
          <select name="perforation3" type="text" class="form-control" id="perforation3" >
          </select>
        </div>
    </div></td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td><div class="form-group">
        <label class="col-md-3 control-label">3 Hole Drilling</label>
        <div class="col-md-9">
          <select name="perforation4" type="text" class="form-control" id="perforation4" >
          </select>
        </div>
    </div></td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td><div class="form-group">
        <label class="col-md-3 control-label">Binding</label>
        <div class="col-md-9">
          <select name="perforation5" type="text" class="form-control" id="perforation5" >
          </select>
        </div>
    </div></td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td><div class="form-group">
        <label class="col-md-3 control-label">Binding
          Placement</label>
        <div class="col-md-9">
          <select name="perforation6" type="text" class="form-control" id="perforation6" >
          </select>
        </div>
    </div></td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td><div class="form-group">
        <label class="col-md-3 control-label">Paper Type</label>
      <div class="col-md-9">
        <select name="perforation7" type="text" class="form-control" id="perforation7" >
        </select>
      </div>
    </div></td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td><div class="form-group">
        <label class="col-md-3 control-label">Quantity</label>
        <div class="col-md-9">
          <select name="perforation8" type="text" class="form-control" id="perforation8" >
          </select>
        </div>
    </div></td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td><div class="form-group">
        <label class="col-md-3 control-label">Printed Side</label>
        <div class="col-md-9">
          <select name="perforation9" type="text" class="form-control" id="perforation9" >
          </select>
        </div>
    </div></td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td><div class="form-group">
        <label class="col-md-3 control-label">Print Turnaround</label>
        <div class="col-md-9">
          <select name="perforation10" type="text" class="form-control" id="perforation10" >
          </select>
        </div>
    </div></td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td><div class="form-group">
        <label class="col-md-3 control-label">NumberLocation </label>
        <div class="col-md-9">
          <select name="perforation11" type="text" class="form-control" id="perforation11" >
          </select>
        </div>
    </div></td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td><div class="form-group">
        <label class="col-md-3 control-label">Starting Number</label>
        <div class="col-md-9">
          <select name="perforation12" type="text" class="form-control" id="perforation12" >
          </select>
        </div>
    </div></td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td><div class="form-group">
        <label class="col-md-3 control-label">Pages</label>
        <div class="col-md-9">
          <select name="perforation13" type="text" class="form-control" id="perforation13" >
          </select>
        </div>
    </div></td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td><div class="form-group">
        <label class="col-md-3 control-label">Cover Paper</label>
        <div class="col-md-9">
          <select name="perforation14" type="text" class="form-control" id="perforation14" >
          </select>
        </div>
    </div></td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td><div class="form-group">
      <label class="col-md-3 control-label">Hole location</label>
      <div class="col-md-9">
        <input name="holelocation" type="text" class="form-control" id="holelocation" placeholder="Enter papertype">
      </div>
    </div></td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td><div class="form-group">
      <label class="col-md-3 control-label">Lamitnation</label>
      <div class="col-md-9">
        <input name="lamination" type="text" class="form-control" id="lamination" placeholder="Enter lamination">
      </div>
    </div></td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td><div class="form-group">
        <label class="col-md-3 control-label">Canvas Cut</label>
        <div class="col-md-9">
          <input name="canvascut" type="text" class="form-control" id="canvascut" placeholder="Enter canvas cut">
        </div>
    </div></td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td><div class="form-group">
        <label class="col-md-3 control-label">Interio Colour</label>
        <div class="col-md-9">
          <input name="interiocolor" type="text" class="form-control" id="interiocolor" placeholder="Enter interiocolor">
        </div>
    </div></td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td><div class="form-group">
        <label class="col-md-3 control-label">Starting price</label>
        <div class="col-md-9">
          <input name="startingprice" type="text" class="form-control" id="startingprice" placeholder="Enter startin price">
        </div>
    </div></td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td><div class="form-group">
      <label class="col-md-3 control-label">Ink Color</label>
      <div class="col-md-9">
        <select class="form-control" name="inkcolor">
          <option value="Red">Red</option>
          <option value="Blue">Blue</option>
          <option value="Black">Black</option>
        </select>
      </div>
    </div></td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td><div class="form-group">
      <label class="col-md-3 control-label">Tabbing</label>
      <div class="col-md-9">
        <input name="tabbing" type="text" class="form-control" id="tabbing" placeholder="Enter tabbing">
      </div>
    </div></td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td><div class="form-group">
      <label class="col-md-3 control-label">Size Cut</label>
      <div class="col-md-9">
        <input name="sizecut" type="text" class="form-control" id="sizecut" placeholder="Enter size cut">
      </div>
    </div></td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td><div class="form-group">
      <label class="col-md-3 control-label">Folding</label>
      <div class="col-md-9">
        <input name="foldiing" type="text" class="form-control" id="foldiing" placeholder="Enter folding">
      </div>
    </div></td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td><div class="form-group">
      <label class="col-md-3 control-label">Canvas Wrapping</label>
      <div class="col-md-9">
        <input type="text" class="form-control" placeholder="Enter canvaswrapping" name="canvaswrapping">
      </div>
    </div></td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td><div class="form-group">
      <label class="col-md-3 control-label">Grommets</label>
      <div class="col-md-9">
        <input type="text" class="form-control" placeholder="Enter gromements" name="gromements">
      </div>
    </div></td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td><div class="form-group">
      <label class="col-md-3 control-label">Herms</label>
      <div class="col-md-9">
        <input type="text" class="form-control" placeholder="Enter herms" name="herms">
      </div>
    </div></td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td><div class="form-group">
      <label class="col-md-3 control-label">polepucket</label>
      <div class="col-md-9">
        <input type="text" class="form-control" placeholder="Enter polepucket" name="polepucket">
      </div>
    </div></td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td><div class="form-group">
        <label class="col-md-3 control-label">Interior Paper</label>
        <div class="col-md-9">
          <input name="interiopaper" type="text" class="form-control" id="interiopaper" placeholder="Enter interiopaper">
        </div>
    </div></td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
</table>
</form>
    </body>
</html>
