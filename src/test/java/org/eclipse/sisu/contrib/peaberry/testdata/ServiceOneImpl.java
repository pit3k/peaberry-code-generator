package org.eclipse.sisu.contrib.peaberry.testdata;

import org.eclipse.sisu.contrib.peaberry.annotations.ServiceExport;

/**
 * Example Service.
 */
@ServiceExport( services = ServiceOne.class)
public class ServiceOneImpl implements ServiceOne {
}
