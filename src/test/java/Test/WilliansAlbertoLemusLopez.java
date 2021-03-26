/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Test;

import Objetos.Carrera;
import Objetos.Horario;
import Objetos.RegistroAcademico;
import Proceso.AsignarHorario;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;

/**
 *
 * @author javes
 */
public class WilliansAlbertoLemusLopez {

    @InjectMocks
    private AsignarHorario asignacion;
    
    @Mock
    private Carrera carrera;
    
    @Mock
    private RegistroAcademico registro;
    
    @Mock
    private Horario horario;
    
    @BeforeEach
    public void setUp(){
        MockitoAnnotations.initMocks(this);
    }
    
    @Test
    public void generarHorarioTest() throws Exception
    {
        when(carrera.procesarCarrera()).thenReturn(1);
        when(registro.cheequearCarnet()).thenReturn(true);
        when(registro.getAnio()).thenReturn(2016);
        
        asignacion = new AsignarHorario();
        horario = asignacion.generarHorario(carrera, registro);
        
        if (horario != null) {
            assertEquals(856, horario.getCodigoHorario());
        }
    }
    
    @Test
    public void getDescripcionTest(){
        when(carrera.procesarCarrera()).thenReturn(1);
        when(registro.cheequearCarnet()).thenReturn(true);
        when(registro.getAnio()).thenReturn(2016);
        
        asignacion = new AsignarHorario();
        horario = asignacion.generarHorario(carrera, registro);
        
        if (horario != null) {
            assertEquals("Mixto", horario.getDescripcion());
        }
    }

}
