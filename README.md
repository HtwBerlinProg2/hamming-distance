# Hamming-Distance

Berechnen Sie den Hamming-Abstand zwischen zwei DNA-Strängen. Ihr Körper besteht aus Zellen, die DNA enthalten. Diese Zellen verschleißen regelmäßig und müssen ersetzt werden, was sie durch die Teilung in Tochterzellen erreichen. Tatsächlich erlebt der durchschnittliche menschliche Körper in seinem Leben etwa 10 Billiarden Zellteilungen!

Wenn sich Zellen teilen, repliziert sich auch ihre DNA. Manchmal passieren während dieses Prozesses Fehler und einzelne DNA-Stücke werden mit den falschen Informationen kodiert. Wenn wir zwei DNA-Stränge vergleichen und die Unterschiede zwischen ihnen zählen, können wir sehen, wie viele Fehler aufgetreten sind. Dies wird als "Hamming-Distanz" bezeichnet.

Wir lesen DNA mit den Buchstaben `C`, `A`, `G` und `T`. Zwei Stränge könnten so aussehen:

```shell
GAGCCTACTAACGGGAT
CATCGTAATGACGGCCT
^ ^ ^  ^ ^    ^^
```
  
Sie haben 7 Unterschiede, und deshalb ist die Hamming-Distanz 7.

Die Hamming-Distanz ist für viele Dinge in der Wissenschaft nützlich, nicht nur für die Biologie, also ist es ein schöner Satz, mit dem man sich vertraut machen kann.

# Aufgaben

1. Schreiben Sie eine Methode, um die Hamming-Distanz zu berechnen. Beachten Sie bei der Implementierung die folgenden Hinweise:

    - Der Hamming-Abstand ist nur für gleich lange Sequenzen definiert, sodass ein Versuch, den Hamming-Abstand zwischen Sequenzen unterschiedlicher Länge zu berechnen, direkt fehlschlägt (Exception).
    - Überlegen Sie wie die Methode aussehen könnte (Name der Methode, Rückgabetyp, Parameter).
    - Verwenden Sie zur Abbildung der DNA-Stränge sowohl Strings als auch char-Arrays und nutzen Sie Methodenüberladung.


2. Testen Sie Ihre Implementierung mit ausreichend Unit-Tests. Es gelten die folgenden Spezifikationen:

   - Beispiel 1
     - Strang A: `[]`
     - Strang B: `[]`
     - Hamming-Abstand: 0
   - Beispiel 2
     - Strang A: `[A]`
     - Strang B: `[A]`
     - Hamming-Abstand: 0
   - Beispiel 3
     - Strang A: `[G]`
     - Strang B: `[T]`
     - Hamming-Abstand: 1
   - Beispiel 4
     - StrangA: `[G, G, A, C, T, G, A, A, A, T, C, T, G]`
     - StrangB: `[G, G, A, C, T, G, A, A, A, T, C, T, G]`
     - Hamming-Abstand: 0
   - Beispiel 5
     - StrangA: `[G, G, A, C, G, G, A, T, T, C, T, G]`
     - StrangB: `[A, G, G, A, C, G, G, A, T, T, C, T]`
     - Hamming-Abstand: 9
   - Beispiel 6
     - Strang A: `[A, A, T, G]`
     - Strang B: `[A, A, T]`
     - Hamming-Abstand: Fehler
