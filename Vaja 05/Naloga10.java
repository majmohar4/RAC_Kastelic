class Naloga10 {
    public static void main(String[] args) {
        int mesec = 32;
        int datum = Integer.valueOf(args[0]);
        String ime="";
        datum = datum%7-1;
        if (datum ==0);
        else if (datum==1) ime = "ponedeljek";
        else if (datum==2) ime = "torek";
        else if (datum==3) ime = "sreda";
        else if (datum==4) ime = "četrtek";
        else if (datum==5) ime = "petek";
        else if (datum==6) ime = "sobota";
        else if (datum==7) ime = "nedelja";
        else;
        System.out.println(ime);
        
        switch(datum){
            case 1: ime = "ponedeljek";
            break;
            case 2: ime = "torek";
            break;
            case 3: ime = "sreda";
            break;
            case 4: ime = "četrtek";
            break;
            case 5: ime = "petek";
            break;
            case 6: ime = "sobota";
            break;
            case 7: ime = "nedelja";
            }
            System.out.println(ime);
        }
    }