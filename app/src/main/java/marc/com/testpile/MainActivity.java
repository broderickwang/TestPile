package marc.com.testpile;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.eazegraph.lib.charts.BarChart;
import org.eazegraph.lib.models.BarModel;

import it.bradipao.lib.descharts.StyledChartPoint;
import it.bradipao.lib.descharts.StyledChartPointSerie;
import it.bradipao.lib.descharts.StyledXyChartView;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		BarChart mBarChart = (BarChart) findViewById(R.id.barchart);

		mBarChart.addBar(new BarModel("山东省",2.3f, 0xFF123456));
		mBarChart.addBar(new BarModel("浙江省",2.f,  0xFF343456));
		mBarChart.addBar(new BarModel("北京市",3.3f, 0xFF563456));
		mBarChart.addBar(new BarModel("河南省",1.1f, 0xFF873F56));
		mBarChart.addBar(new BarModel("天津市",2.7f, 0xFF56B7F1));
		mBarChart.addBar(new BarModel("f",2.f,  0xFF343456));
		mBarChart.addBar(new BarModel("g",0.4f, 0xFF1FF4AC));
		mBarChart.addBar(new BarModel(4.3f,  0xFF1BA4E6));

		mBarChart.startAnimation();

		StyledXyChartView vChart = (StyledXyChartView)findViewById(R.id.chart);
		StyledChartPointSerie rr = new StyledChartPointSerie(2);
		rr.addPoint(new StyledChartPoint(-90, 99,0xff99cc00,0xffeeeeee));
		rr.addPoint(new StyledChartPoint(-49, 80,0xffff4444,0xffffcccc));
		rr.addPoint(new StyledChartPoint( -5,180,0xff99cc00,0xffeeff99));
		rr.addPoint(new StyledChartPoint( 17, 99,0xffffbb33,0xffffee99));
		rr.addPoint(new StyledChartPoint( 54, 80,0xff33bbee,0xffeeeeee));
		rr.addPoint(new StyledChartPoint(125,120,0xff99cc00,0xffeeeeee));
		rr.addPoint(new StyledChartPoint(158, 20,0xffff4444,0xffeeeeee));
		rr.addPoint(new StyledChartPoint(209, 50,0xffff4444,0xffffcccc));
		rr.addPoint(new StyledChartPoint(297,109,0xff33bbee,0xff99ddff));

		// create SECOND serie
		StyledChartPointSerie gg = new StyledChartPointSerie(2);
		gg.addPoint(new StyledChartPoint( 17,-10, Color.BLACK,Color.TRANSPARENT,0xffff8800,5));
		gg.addPoint(new StyledChartPoint( 54, 20,Color.BLACK,Color.TRANSPARENT,0xffcc0000,5));
		gg.addPoint(new StyledChartPoint(125,-50,Color.BLACK,Color.TRANSPARENT,0xff669900,5));
		gg.addPoint(new StyledChartPoint(158, 89,Color.BLACK,Color.TRANSPARENT,Color.GRAY,8));
		gg.addPoint(new StyledChartPoint(209, 20,Color.BLACK,Color.TRANSPARENT,Color.GRAY,4));
		gg.addPoint(new StyledChartPoint(217,Float.NaN,Color.BLACK,Color.TRANSPARENT,Color.GRAY,4));
		gg.addPoint(new StyledChartPoint(250, 99,Color.BLACK,Color.TRANSPARENT,Color.GRAY,4));
		gg.addPoint(new StyledChartPoint(261, 75,Color.BLACK,Color.TRANSPARENT,Color.GRAY,4));
		gg.addPoint(new StyledChartPoint(295, 33,Color.BLACK,Color.TRANSPARENT,Color.GRAY,4));

		// add lines to chart
		vChart.addSerie(rr);
		vChart.addSerie(gg);
	}
}
