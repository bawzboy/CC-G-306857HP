package Schleifen;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import javax.swing.JFrame;
import java.awt.Dimension;

public class GraphTestDifferentialgleichung extends JFrame {

    public GraphTestDifferentialgleichung(String Krankheitsverlauf) {
        super(Krankheitsverlauf);
        
        // Erstellen Sie die Datenreihe
        XYSeries series = new XYSeries("Krankheitsverlauf");
        double t = 0.0;
        double dt = 1.0;
        double k = 0.1;
        double xn = 0.01;
        double dx = 0;
        while (t < 100) {
            t = t + dt;
            dx = k * xn * (1 - xn) * dt;
            xn = xn + dx;
            series.add(t, xn);
        }

        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(series);

        // Erstellen Sie das Diagramm
        JFreeChart chart = ChartFactory.createXYLineChart(
            "Krankheitsverlauf",
            "Zeit (Tage)",
            "Anzahl Erkrankter",
            dataset,
            PlotOrientation.VERTICAL,
            true, true, false);

        // Fügen Sie das Diagramm zu einem Panel hinzu
        ChartPanel panel = new ChartPanel(chart);
        panel.setPreferredSize(new Dimension(800, 600));
        setContentPane(panel);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            GraphTestDifferentialgleichung example = new GraphTestDifferentialgleichung("Aufgabe 4.5 Iterative Lösung einer Differentialgleichung");
            example.setSize(800, 600);
            example.setLocationRelativeTo(null);
            example.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            example.setVisible(true);
        });
    }
}
