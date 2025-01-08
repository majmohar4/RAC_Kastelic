------------------------------------------------------------------------
This is the project README file. Here, you should describe your project.
Tell the reader (someone who does not know anything about this project)
all he/she needs to know. The comments should usually include at least:
------------------------------------------------------------------------

PROJECT TITLE: Navadne metode razvrščanj

PURPOSE OF PROJECT: demonstracija enostavnih metod razvrščanja
                    implementacija (kodiranje) postopkov
                    
VERSION or DATE: feb. 2013
HOW TO START THIS PROJECT:
AUTHORS: G3AB_gen 2012_13

USER INSTRUCTIONS:
metode so dodane v knjižnjico 'sortiranja'. Uporabite jih na enak način, kot
uporabljate Arrays:

import sortiranja.*;

nato uproabite kot:

Sortiraj.navadnoVstavljanje(tabela_intov);
Sortiraj.navadnoIzbiranje(tabela_intov);

mehurčna razvrščanja:

Sortiraj.kmetSort(tabela_intov);
Sortiraj.bubble_1(tabela_intov);    // analogija kmetSort, le notranja zanka gre v drugo smer
Sortiraj.bubble_2(tabela_intov);    // izboljšava: sortira le po neurejenem delu
Sortiraj.bubbleSort(tabela_intov);  // pravi bubblesort (sortira po urejenem, detektira urejenost in ustavi)

