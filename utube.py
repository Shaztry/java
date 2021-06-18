link = input("Enter the url..")
video = Youtube(link)
stream = video.streams.get.highest_resolution()
stream.download()