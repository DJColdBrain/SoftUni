<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>First Steps Into PHP</title>

</head>
<body>
    <form>
        N: <input type="text" name="num" />
        <input type="submit" />
    </form>
	<!--Write your PHP Script here-->
    <?php
    if (isset($_GET["num"])) {
        $num = intval($_GET["num"]);
        $last = 0;
        $current = 0;
        $sum = 1;
        for ( $i=1; $i <=$num; $i++  ){
            $current = $sum;
            $sum = $current+$last;
            echo "$sum ";
            if ($i >= 2){
            $last = $current;
            }
        }
    }
    ?>
</body>
</html>