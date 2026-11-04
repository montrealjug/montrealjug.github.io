package org.montrealjug.site;

import java.time.Year;

import io.quarkus.qute.TemplateGlobal;

@TemplateGlobal
public class SiteGlobals {

    /** Jekyll's {@code site.time | date: '%Y'}. */
    static int currentYear() {
        return Year.now().getValue();
    }
}
