# Check common Java installation locations
$javaPaths = @(
    "C:\Program Files\Java",
    "C:\Program Files (x86)\Java",
    "C:\Program Files\Eclipse Adoptium",
    "C:\Program Files\Eclipse Foundation",
    "C:\Program Files\AdoptOpenJDK",
    "C:\Program Files\Zulu"
)

$javaFound = $false

foreach ($javaPath in $javaPaths) {
    if (Test-Path $javaPath) {
        # Find JDK 11 directory
        $jdkDirs = Get-ChildItem -Path $javaPath -Directory | Where-Object { 
            $_.Name -like "*jdk-11*" -or $_.Name -like "*jdk11*" -or 
            ($_.Name -like "*jdk*" -and $_.Name -like "*11*") 
        }
        
        if ($jdkDirs.Count -gt 0) {
            $javaHome = $jdkDirs[0].FullName
            Write-Host "Setting JAVA_HOME to: $javaHome"
            $env:JAVA_HOME = $javaHome
            $env:PATH = "$javaHome\bin;$env:PATH"
            $javaFound = $true
            
            # Run the application
            Write-Host "Running the application..."
            ./mvnw spring-boot:run
            break
        }
    }
}

if (-not $javaFound) {
    Write-Host "No JDK 11 installation found. Please install Java 11 and try again."
    Write-Host "You can download it from: https://adoptium.net/temurin/releases/?version=11"
} 
