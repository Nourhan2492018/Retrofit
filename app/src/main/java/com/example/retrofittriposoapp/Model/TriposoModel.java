package com.example.retrofittriposoapp.Model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class TriposoModel {

    @SerializedName("results")
    private final List<Results> results;

    @SerializedName("more")
    private final boolean more;

    public TriposoModel(List<Results> results, boolean more) {
        this.results = results;
        this.more = more;
    }

    public List<Results> getResults() {
        return results;
    }

    public boolean isMore() {
        return more;
    }

    public static class Results {
        @SerializedName("id")
        private final String id;

        @SerializedName("parent_id")
        private final String parentId;

        @SerializedName("coordinates")
        private final Coordinates coordinates;

        @SerializedName("score")
        private final double score;

        @SerializedName("country_id")
        private final String countryId;

        @SerializedName("type")
        private final String type;

        @SerializedName("images")
        private final ArrayList<Images> images;

        @SerializedName("attribution")
        private final List<Attribution> attribution;

        @SerializedName("name")
        private final String name;

        @SerializedName("snippet_language_info")
        private final Object snippetLanguageInfo;

        @SerializedName("snippet")
        private final String snippet;

        public Results(String id, String parentId, Coordinates coordinates, double score,
                       String countryId, String type, ArrayList<Images> images, List<Attribution> attribution,
                       String name, Object snippetLanguageInfo, String snippet) {
            this.id = id;
            this.parentId = parentId;
            this.coordinates = coordinates;
            this.score = score;
            this.countryId = countryId;
            this.type = type;
            this.images = images;
            this.attribution = attribution;
            this.name = name;
            this.snippetLanguageInfo = snippetLanguageInfo;
            this.snippet = snippet;
        }

        public String getId() {
            return id;
        }

        public String getParentId() {
            return parentId;
        }

        public Coordinates getCoordinates() {
            return coordinates;
        }

        public double getScore() {
            return score;
        }

        public String getCountryId() {
            return countryId;
        }

        public String getType() {
            return type;
        }

        public ArrayList<Images> getImages() {
            return images;
        }

        public List<Attribution> getAttribution() {
            return attribution;
        }

        public String getName() {
            return name;
        }

        public Object getSnippetLanguageInfo() {
            return snippetLanguageInfo;
        }

        public String getSnippet() {
            return snippet;
        }

        public static class Coordinates {
            @SerializedName("latitude")
            private final double latitude;

            @SerializedName("longitude")
            private final double longitude;

            public Coordinates(double latitude, double longitude) {
                this.latitude = latitude;
                this.longitude = longitude;
            }

            public double getLatitude() {
                return latitude;
            }

            public double getLongitude() {
                return longitude;
            }
        }

        public static class Images {
            @SerializedName("attribution")
            private final Attribution attribution;

            @SerializedName("license")
            private final String license;

            @SerializedName("caption")
            private final String caption;

            @SerializedName("sizes")
            private final Sizes sizes;

            @SerializedName("source_url")
            private final String sourceUrl;

            @SerializedName("owner")
            private final String owner;

            @SerializedName("source_id")
            private final String sourceId;

            @SerializedName("owner_url")
            private final String ownerUrl;

            public Images(Attribution attribution, String license, String caption, Sizes sizes,
                          String sourceUrl, String owner, String sourceId, String ownerUrl) {
                this.attribution = attribution;
                this.license = license;
                this.caption = caption;
                this.sizes = sizes;
                this.sourceUrl = sourceUrl;
                this.owner = owner;
                this.sourceId = sourceId;
                this.ownerUrl = ownerUrl;
            }

            public Attribution getAttribution() {
                return attribution;
            }

            public String getLicense() {
                return license;
            }

            public String getCaption() {
                return caption;
            }

            public Sizes getSizes() {
                return sizes;
            }

            public String getSourceUrl() {
                return sourceUrl;
            }

            public String getOwner() {
                return owner;
            }

            public String getSourceId() {
                return sourceId;
            }

            public String getOwnerUrl() {
                return ownerUrl;
            }

            public static class Attribution {
                @SerializedName("license_link")
                private final String licenseLink;

                @SerializedName("attribution_link")
                private final String attributionLink;

                @SerializedName("attribution_text")
                private final String attributionText;

                @SerializedName("license_text")
                private final String licenseText;

                @SerializedName("format")
                private final String format;

                public Attribution(String licenseLink, String attributionLink,
                                   String attributionText, String licenseText, String format) {
                    this.licenseLink = licenseLink;
                    this.attributionLink = attributionLink;
                    this.attributionText = attributionText;
                    this.licenseText = licenseText;
                    this.format = format;
                }

                public String getLicenseLink() {
                    return licenseLink;
                }

                public String getAttributionLink() {
                    return attributionLink;
                }

                public String getAttributionText() {
                    return attributionText;
                }

                public String getLicenseText() {
                    return licenseText;
                }

                public String getFormat() {
                    return format;
                }
            }

            public static class Sizes {
                @SerializedName("medium")
                private final Medium medium;

                @SerializedName("original")
                private final Original original;

                @SerializedName("thumbnail")
                private final Thumbnail thumbnail;

                public Sizes(Medium medium, Original original, Thumbnail thumbnail) {
                    this.medium = medium;
                    this.original = original;
                    this.thumbnail = thumbnail;
                }

                public Medium getMedium() {
                    return medium;
                }

                public Original getOriginal() {
                    return original;
                }

                public Thumbnail getThumbnail() {
                    return thumbnail;
                }

                public static class Medium {
                    @SerializedName("url")
                    private final String url;

                    @SerializedName("width")
                    private final int width;

                    @SerializedName("format")
                    private final String format;

                    @SerializedName("bytes")
                    private final int bytes;

                    @SerializedName("height")
                    private final int height;

                    public Medium(String url, int width, String format, int bytes, int height) {
                        this.url = url;
                        this.width = width;
                        this.format = format;
                        this.bytes = bytes;
                        this.height = height;
                    }

                    public String getUrl() {
                        return url;
                    }

                    public int getWidth() {
                        return width;
                    }

                    public String getFormat() {
                        return format;
                    }

                    public int getBytes() {
                        return bytes;
                    }

                    public int getHeight() {
                        return height;
                    }
                }

                public static class Original {
                    @SerializedName("url")
                    private final String url;

                    @SerializedName("width")
                    private final int width;

                    @SerializedName("format")
                    private final String format;

                    @SerializedName("bytes")
                    private final int bytes;

                    @SerializedName("height")
                    private final int height;

                    public Original(String url, int width, String format, int bytes, int height) {
                        this.url = url;
                        this.width = width;
                        this.format = format;
                        this.bytes = bytes;
                        this.height = height;
                    }

                    public String getUrl() {
                        return url;
                    }

                    public int getWidth() {
                        return width;
                    }

                    public String getFormat() {
                        return format;
                    }

                    public int getBytes() {
                        return bytes;
                    }

                    public int getHeight() {
                        return height;
                    }
                }

                public static class Thumbnail {
                    @SerializedName("url")
                    private final String url;

                    @SerializedName("width")
                    private final int width;

                    @SerializedName("format")
                    private final String format;

                    @SerializedName("bytes")
                    private final int bytes;

                    @SerializedName("height")
                    private final int height;

                    public Thumbnail(String url, int width, String format, int bytes, int height) {
                        this.url = url;
                        this.width = width;
                        this.format = format;
                        this.bytes = bytes;
                        this.height = height;
                    }

                    public String getUrl() {
                        return url;
                    }

                    public int getWidth() {
                        return width;
                    }

                    public String getFormat() {
                        return format;
                    }

                    public int getBytes() {
                        return bytes;
                    }

                    public int getHeight() {
                        return height;
                    }
                }
            }
        }

        public static class Attribution {
            @SerializedName("source_id")
            private final String sourceId;

            @SerializedName("url")
            private final String url;

            public Attribution(String sourceId, String url) {
                this.sourceId = sourceId;
                this.url = url;
            }

            public String getSourceId() {
                return sourceId;
            }

            public String getUrl() {
                return url;
            }
        }
    }
}
