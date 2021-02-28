$Url = "http://localhost:8080/check"

while ($true) { 
    $response = Invoke-WebRequest -Uri $Url
    $responseVersion = ($response | ConvertFrom-Json).version
    $responseCode = ($response | ConvertFrom-Json).responseCode
     
    

    if ($responseVersion -eq 1) { 
        Write-Host "version=" $responseVersion  ", code="  $responseCode -ForegroundColor Green  
    }  ElseIf ($responseVersion -eq 2) { 
         Write-Host "version=" $responseVersion  ", code="  $responseCode -ForegroundColor Yellow
    } else {
         Write-Host "version=" $responseVersion  ", code="  $responseCode  -ForegroundColor Red
    } 
    Start-Sleep -Milliseconds 500
}