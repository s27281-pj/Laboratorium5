class TestKsiazek {
    public static void main(String[] args) {
        List<Ksiazka> listaKsiazek = new ArrayList<>();
        listaKsiazek.add(new Ebook("Tytuł Ebooka", "Autor Ebooka", 200, 1024, "PDF"));
        listaKsiazek.add(new KsiazkaPapierowa("Tytuł Książki Papierowej", "Autor Książki Papierowej", 300, 2020));
        listaKsiazek.add(new Ebook("Inny Tytuł Ebooka", "Inny Autor Ebooka", 150, 512, "EPUB"));
        listaKsiazek.add(new KsiazkaPapierowa("Inny Tytuł Książki Papierowej", "Inny Autor Książki Papierowej", 250, 2018));

        System.out.println("Lista książek przed sortowaniem:");
        for (Ksiazka ksiazka : listaKsiazek) {
            System.out.println(ksiazka);
        }

        listaKsiazek.sort(Comparator.comparing(Ksiazka::getTytul));

        System.out.println("\nLista książek po sortowaniu:");
        listaKsiazek.forEach(System.out::println);
    }
}