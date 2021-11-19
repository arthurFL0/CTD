foreach($nome in $(Get-Content -Path lista_nomes.txt)) {

	Write-Output "O nome é $nome"
    $nomeQuantid++

if ($nome -eq "Pedro") {
  Write-Output "Encontrou $nome"
} else {
   $outrosNomes++
}


}

Write-Output "Quantidade de nomes repetidos: $($nomeQuantid-$outrosNomes)"
