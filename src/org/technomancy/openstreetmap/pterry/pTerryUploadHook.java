// License: GPL. For details, see LICENSE file.
package org.technomancy.openstreetmap.pterry;

import java.util.Map;

import org.openstreetmap.josm.actions.upload.UploadHook;

public class pTerryUploadHook implements UploadHook {
    @Override
    public void modifyChangesetTags(Map<String, String> tags) {
        tags.put("hashtags", "#tomtom");
    }
}
