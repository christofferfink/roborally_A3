package dk.dtu.compute.se.pisd.roborally.model.BoardTemplate;

import dk.dtu.compute.se.pisd.roborally.controller.FieldAction;
import dk.dtu.compute.se.pisd.roborally.model.Heading;

import java.util.ArrayList;
import java.util.List;
/**
 * Christoffer Fink, s205449
 */
public class BoardTemplateTest {
    public int x;
    public int y;

    public List<Heading> walls = new ArrayList<>();
    public List<FieldAction> actions = new ArrayList<>();
}
