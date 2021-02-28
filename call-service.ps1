$Url = "http://localhost:8080/check"

while ($true) { 
    $response = Invoke-WebRequest -Uri $Url
    $responseVersion = ($response | ConvertFrom-Json).version
    $responseCode = ($response | ConvertFrom-Json).responseCode
     
    

    if ($responseVersion -eq 0) { 
        Write-Host "version=" $responseVersion  ", code="  $responseCode -ForegroundColor White  
    }  ElseIf ($responseVersion -eq 1) { 
         Write-Host "version=" $responseVersion  ", code="  $responseCode -ForegroundColor Yellow
    }  ElseIf ($responseVersion -eq 2) { 
         Write-Host "version=" $responseVersion  ", code="  $responseCode -ForegroundColor Blue
    }  ElseIf ($responseVersion -eq 3) { 
         Write-Host "version=" $responseVersion  ", code="  $responseCode -ForegroundColor Green
    }  else {
         Write-Host "version=" $responseVersion  ", code="  $responseCode  -ForegroundColor Red
    } 
    Start-Sleep -Milliseconds 500
}