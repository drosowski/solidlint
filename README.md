# SOLIDe Software durch Linting

Als Entwickler:innen sind wir immer schnell dabei, Linting-Werkzeuge in unseren Buildprozess zu integrieren. Checkstyle, PMD oder spotbugs für Java, oder ktlint und detekt für Kotlin sind wichtige und hilfreiche Werkzeuge die uns zum einen die unnötigen und fruchtlosen Diskussionen um Codestyle ersparen.

Viel spannender ist aber die statische Codeanalyse die strukturelle Probleme im Sourcecode aufzeigt. Denn bspw. zyklomatische Komplexität oder die Anzahl von Parametern in einem Konstruktor sollten nicht auf die leichte Schulter genommen werden und erst recht nicht dauerhaft unterdrückt werden. Denn oftmals sind diese Probleme nur Symptome und die Ursache sind häufig Verletzungen gegen die SOLID Prinzipien.

In diesem Vortrag werden wir uns gemeinsam ein paar Beispiele von Code Violations vornehmen. Daraufhin untersuchen wir die gefundenen Probleme und versuchen die darunter liegenden Ursachen zu finden. Im besten Fall leiten wir konkrete Maßnahmen in Form von Refactorings ab, die uns zu einer verständlicheren und wartbareren Codebase führen.

## solidlint

Hierbei handelt es sich um eine Beispiel-Codebase auf Basis von *Kotlin* und *detekt*.
Es werden verschiedene Regelverstöße von detekt erkannt, die allerdings vorerst mit einem `@Suppress` unterdrückt wurden.
Jedes Package beinhaltet Regelverstöße die auf eine Verletzung der SOLID Prinzipien zurückführen können (aber natürlich auch andere Probleme).

In dem jeweils gleichnamigen Branch findet ihr einen Versuch, die Regelverstöße unter Beachtung der SOLID Prinzipien aufzulösen und dadurch zu einer erweiterbaren und wartbaren Codebase zu kommen.

gl&hf :-)
