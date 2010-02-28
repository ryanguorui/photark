/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.    
 */

package org.apache.photark.services.gallery.filesystem;

import java.io.File;
import java.net.URISyntaxException;
import java.util.Date;

import org.apache.photark.Image;
import org.junit.Assert;
import org.junit.Test;

public class ImageMetadataScannerTestCase {

    @Test
    public void testMetadataScanner() throws URISyntaxException {
        File imageFile = new File(ImageMetadataScannerTestCase.class.getClassLoader().getResource("gallery-home/album-1/IMG_0735.jpg").toURI());
        Image image = new Image(imageFile, new Date());
        Assert.assertNotNull(image.getImageMetadata());
        Assert.assertTrue(image.getImageMetadata().size() > 0);
        /* for debug purpose
        for(ImageMetadata metadata : image.getImageMetadata()) {
            System.out.println(">>" + metadata.getKey() + "\t" + metadata.getValue());
        }
        */
    }
}