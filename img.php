<form action="upload.php" method="post" enctype="multipart/form-data">
    <label>Select Image File:</label>
    <input type="file" name="image">
    <input type="submit" name="submit" value="Upload">
</form>

<?php
$msg = "";
if (isset($_POST['upload'])) {

    $filename = $_FILES["uploadfile"]["name"];
    $tempname = $_FILES["uploadfile"]["tmp_name"];  
        $folder = "image/".$filename;
        
    $db = mysqli_connect("localhost", "root", "", "photos");
        $sql = "INSERT INTO image (filename) VALUES ('$filename')";
        mysqli_query($db, $sql);
        if (move_uploaded_file($tempname, $folder)) 
        {
            $msg = "Image uploaded successfully";
        }
        else
        {
            $msg = "Failed to upload image";
        }
}
?>
