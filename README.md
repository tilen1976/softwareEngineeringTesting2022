# softwareEngineeringTesting2022
repository for oppgaver i Software Engineering og testing ved Hiof 2022

Satt opp repository, klonet repo lokalt og pushet oblig 2 
Testet både ferdig oppsett og lage selv på Github actions.
Men endte opp med "Java with Gradle By GitHub Actions"
Fikk i begynnelsen ulike errors
Satte derfor inn et oppsett for Gradle i settings.gradle som jeg fant på "https://docs.gradle.org/current/userguide/github-actions.html"
Deretter satte jeg inn testLogging i build.gradle
Men det var tilgangsrettighetene som var problemet "https://docs.gradle.org/current/userguide/troubleshooting.html#permission_denied"
Jeg fikk tilgang ved å redigere gradle.yml:
 - name: Change wrapper permissions
      run: chmod +x ./gradlew
I tillegg endret jeg setup Java til samme versjon jeg brukte (på grunn av feilsøking underveis):
- name: Set up JDK 15
      uses: actions/setup-java@v3
      with:
        java-version: '15'
        distribution: 'zulu'
Jeg får fortsatt advarsler om "save state"
