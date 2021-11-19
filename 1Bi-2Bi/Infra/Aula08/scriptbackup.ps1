$sourcePath = "C:\Users\Deposito\teste\*"

$destinyPath = "C:\Users\Deposito\backup\"

$date = Get-Date -Format d-M-yyy

Copy-Item $sourcePath $destinyPath -Recurse -Verbose > "$destinyPath\log-$date.txt"