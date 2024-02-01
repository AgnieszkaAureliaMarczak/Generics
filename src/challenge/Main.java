package challenge;

public class Main {
    public static void main(String[] args) {

        var mountains = new Mountain[]{
                new Mountain("Kosciuszko", "-36.011706219781395, 150.41630081597438"),
                new Mountain("Mount Townsend", "47.86898717275706, -123.05155271927094"),
                new Mountain("Mount Twynam", "-36.39232647394617, 148.31728526219683")
        };

        Layer<Mountain> mountainLayer = new Layer<>(mountains);
        mountainLayer.renderLayer();

        var rivers = new River[]{
                new River("Murray", "-35.364782084665094, 143.79421962212058",
                        "-35.552856941035316, 144.0177690309446", "-35.710877, 144.226729"),
                new River("Darling", "-31.41240873977866, 143.96813011572004",
                        "-31.659959, 143.341335", "-31.892517, 143.006396")
        };

        Layer<River> riverLayer = new Layer<>(rivers);
        riverLayer.addElements(
                new River("Brisbane", "-26.89221903042431, 152.32886521672884",
                        "-27.136344, 152.495523", "-27.572597, 152.896470")
        );
        riverLayer.renderLayer();
    }
}
