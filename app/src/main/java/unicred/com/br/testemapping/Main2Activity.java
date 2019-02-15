package unicred.com.br.testemapping;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import static unicred.com.br.testemapping.TesteDTOParser.DomainObjectA;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DomainObjectA domainObjectA = new TesteDTO("name", "123", "1010").map().resultAsDomainA();

    }

}
